package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

/**
 * class to execute all the queries
 * 
 * @author Amit
 *
 */
public class MainClass {

	/**
	 * main method to execute all the queries
	 * 
	 * @param args
	 *            : String[]
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			// execute assignment one
			System.out.println("Assignment one");
			mainClass.booksByAuthor(bufferedReader);

			// execute assignment two
			System.out.println("Assignment two");
			mainClass.isBookIssued(bufferedReader);

			// execute assignment three
			System.out.println("Assignment three");
			mainClass.deleteUnIssuedBooks();
		} catch (IOException e) {
			System.out.println("IOException\n" + e.getLocalizedMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException\n"
					+ e.getLocalizedMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException\n" + e.getLocalizedMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception\n" + e.getLocalizedMessage());
			e.printStackTrace();
		} finally {
			try {
				if(bufferedReader!=null)
				bufferedReader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	/**
	 * method to get title of books purchased by using author name
	 * 
	 * @param bufferedReader
	 *            : BufferedReader object
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void booksByAuthor(BufferedReader bufferedReader)
			throws IOException, ClassNotFoundException, SQLException {

		boolean toContinue = true;
		String authorName = "";
		// take input : author name
		while (toContinue) {
			System.out.println("Please enter the name of the author ");
			authorName = bufferedReader.readLine();
			authorName = authorName.trim();
			// validate author name
			if ((authorName.length() == 0)) {
				System.out.println("Enter a valid author name  ");
			} else {
				toContinue = false;
			}
		}

		// get the list of titles of purchased books
		List<Books> bookList = DatabaseManager.bookDetailsByAuthor(authorName);

		// display list of titles
		if (!bookList.isEmpty()) {
			System.out.println("\nTitle Name\n");
			for (Books books : bookList) {
				System.out.println(books.getTitle());
			}
		} else {
			System.out
					.println("No matching data found in the database for author "
							+ authorName);
		}
	}

	/**
	 * method to delete all the entries of books that have not been issued since
	 * pas one year
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void deleteUnIssuedBooks() throws ClassNotFoundException,
			SQLException {
		DatabaseManager.deleteUnIssuedBooks();
	}

	/**
	 * method to check book availability given book title and member name
	 * 
	 * @param bufferedReader
	 *            : BufferedReader object
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void isBookIssued(BufferedReader bufferedReader) throws IOException,
			ClassNotFoundException, SQLException {
		boolean toContinue = true;
		String title = "";
		String member = "";

		// take input : book name
		while (toContinue) {
			System.out.println("Enter the name of the book");
			title = bufferedReader.readLine();
			title = title.trim();
			if (title.length() == 0) {
				System.out.println("Enter a valid book title");
			} else {
				toContinue = false;
			}
		}

		// take input : member name
		toContinue = true;
		while (toContinue) {
			System.out.println("Enter the member name");
			member = bufferedReader.readLine();
			member = member.trim();
			if (member.length() == 0) {
				System.out.println("Enter a valid member name");
			} else {
				toContinue = false;
			}
		}

		int memberNo = DatabaseManager.getMemberIdByMemberName(member);
		int titleId = DatabaseManager.getTitleIdByTitleName(title);

		// check if the member name and title are present in the library system
		// database
		if (memberNo == -1 || titleId == -1) {
			System.out.println("no such member name or title name found");
		}
		// get flag corresponding to book availability
		else {
			int accessionNo = DatabaseManager
					.getAccessionNumberByTitleId(titleId);
			if (DatabaseManager.isBookIssued(accessionNo, memberNo)) {
				System.out.println("Book is not available");
			} else {
				System.out.println("Book is available");
			}
		}

	}
}
