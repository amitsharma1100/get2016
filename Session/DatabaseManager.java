package assignment1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * class to interact with the database
 * 
 * @author Amit
 *
 */
public class DatabaseManager {

	private static final int DEFAULT_VALUE = -1;
	private static final int UNSET = 0;
	private static final int SET = 1;

	/**
	 * method to get title of books purchased by using author name
	 * 
	 * @param authorName
	 *            : String
	 * @return : List<Books> -> list of purchased books of the given author name
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static List<Books> bookDetailsByAuthor(String authorName)
			throws ClassNotFoundException, SQLException {
		List<Books> resultBooks = new ArrayList<Books>();
		final String query = "SELECT t.title_nm FROM titles t"
				+ " INNER JOIN title_author ta "
				+ " ON ta.title_id=t.title_id " + "INNER JOIN authors a "
				+ "ON a.author_id=ta.author_id" + " WHERE a.author_nm='"
				+ authorName + "'";

		Statement statement = ConnectionManager.getConnection()
				.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		resultSet.last();
		int totalRows = resultSet.getRow();
		resultSet.beforeFirst();
		if (resultSet != null && totalRows > 0) {
			Books books;
			while (resultSet.next()) {
				books = new Books();
				books.setTitle(resultSet.getString(1));
				resultBooks.add(books);
			}
		}
		return resultBooks;
	}

	/**
	 * method to get title id by using title name
	 * 
	 * @param titleName
	 *            : String
	 * @return : int -> title id corresponding to given title name if match
	 *         found or DEFAULT_VALUE if no match found
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static int getTitleIdByTitleName(String titleName)
			throws SQLException, ClassNotFoundException {
		Statement statement = ConnectionManager.getConnection()
				.createStatement();
		ResultSet resultSet = statement
				.executeQuery("SELECT title_id FROM titles WHERE title_nm='"
						+ titleName + "'");
		if (resultSet != null && resultSet.getRow() > 0) {
			resultSet.next();
			return resultSet.getInt(1);
		} else {
			return DEFAULT_VALUE;
		}
	}

	/**
	 * method to get Member id by using Member name
	 * 
	 * @param memberName
	 *            : String
	 * @return : int -> Member id corresponding to given Member name if match
	 *         found or DEFAULT_VALUE if no match found
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static int getMemberIdByMemberName(String memberName)
			throws SQLException, ClassNotFoundException {

		Statement statement = ConnectionManager.getConnection()
				.createStatement();
		ResultSet resultSet = statement
				.executeQuery("SELECT member_id FROM members WHERE member_nm='"
						+ memberName + "'");
		if (resultSet != null && resultSet.getRow() > 0) {
			resultSet.next();
			return resultSet.getInt(1);
		} else {
			return DEFAULT_VALUE;
		}
	}

	/**
	 * method to get Accession Number by using Title Id
	 * 
	 * @param titleId
	 *            : int
	 * @return : int -> Accession Number corresponding to given Title Id if
	 *         match found or DEFAULT_VALUE if no match found
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static int getAccessionNumberByTitleId(int titleId)
			throws SQLException, ClassNotFoundException {

		Statement statement = ConnectionManager.getConnection()
				.createStatement();
		ResultSet resultSet = statement
				.executeQuery("SELECT accession_no FROM books WHERE title_id="
						+ titleId);
		if (resultSet != null && resultSet.getRow() > 0) {
			resultSet.next();
			return resultSet.getInt(1);
		} else {
			return -1;
		}
	}

	/**
	 * method to check if a book has been issued to a member given the accession
	 * number of book and member id
	 * 
	 * @param accessionNo
	 *            : int
	 * @param memberNo
	 *            : int
	 * @return : boolean -> true if book is issued else false
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static boolean isBookIssued(int accessionNo, int memberNo)
			throws ClassNotFoundException, SQLException {
		Statement statement = ConnectionManager.getConnection()
				.createStatement();
		ResultSet resultSet = statement
				.executeQuery("SELECT * FROM book_issue WHERE accession_no="
						+ accessionNo + " AND member_id=" + memberNo);
		if (resultSet.getRow() > 0 && resultSet != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * method to delete all books entries those have not been issued since pas
	 * one year
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void deleteUnIssuedBooks() throws ClassNotFoundException,
	SQLException {
		DatabaseManager.updateForeignKeyChecks(UNSET);
		String query = "DELETE FROM books WHERE accession_no NOT IN (SELECT accession_no FROM book_issue WHERE ABS(DATEDIFF(CURDATE(),issue_dt)) < 365)";
		Statement statement = ConnectionManager.getConnection()
				.createStatement();
		int rowsDeleted = statement.executeUpdate(query);
		System.out.println(rowsDeleted + "rows deleted ");
		DatabaseManager.updateForeignKeyChecks(SET);
	}

	/*
	 * method to update the foriengn key checks to perform updates
	 * 
	 * @param status : int -> status to set over the foriengn key checks
	 * 
	 * @throws ClassNotFoundException
	 * 
	 * @throws SQLException
	 */
	private static void updateForeignKeyChecks(int status)
			throws ClassNotFoundException, SQLException {
		Statement statement = ConnectionManager.getConnection()
				.createStatement();
		statement.executeUpdate("SET foreign_key_checks =" + status);
	}
}
