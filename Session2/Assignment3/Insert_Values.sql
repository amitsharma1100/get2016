USE ECOMMERCE;

INSERT into categories (category_nm) VALUES ("Mobile And Tablets");
INSERT into categories (category_nm) VALUES ("Home Appliances ");
INSERT into categories (category_nm) VALUES ("Computers");

INSERT into categories (category_nm,parent_id) VALUES ("Mobile",1);
INSERT into categories (category_nm,parent_id) VALUES ("Tablets",1);
INSERT into categories (category_nm,parent_id) VALUES ("Accessories",1);
INSERT into categories (category_nm,parent_id) VALUES ("Cases And Covers",1);

INSERT into categories (category_nm,parent_id) VALUES ("Smart Phones",4);
INSERT into categories (category_nm,parent_id) VALUES ("Featured Phones",4);

INSERT into categories (category_nm,parent_id) VALUES ("2G",5);
INSERT into categories (category_nm,parent_id) VALUES ("3G",5);

INSERT into categories (category_nm,parent_id) VALUES ("TV",2);
INSERT into categories (category_nm,parent_id) VALUES ("Air Conditioner",2);
INSERT into categories (category_nm,parent_id) VALUES ("Washing Machine",2);

INSERT into categories (category_nm,parent_id) VALUES ("Full Automatic",14);
INSERT into categories (category_nm,parent_id) VALUES ("Semi Automatic",14);

INSERT into categories (category_nm,parent_id) VALUES ("Top Load",15);
INSERT into categories (category_nm,parent_id) VALUES ("Front Load",15);

INSERT into categories (category_nm,parent_id) VALUES ("LED",12);
INSERT into categories (category_nm,parent_id) VALUES ("LCD",12);
INSERT into categories (category_nm,parent_id) VALUES ("Plasma",12);

INSERT into categories (category_nm,parent_id) VALUES ("Desktop",3);
INSERT into categories (category_nm,parent_id) VALUES ("Laptop",3);
INSERT into categories (category_nm,parent_id) VALUES ("Laptop Accesories",3);
INSERT into categories (category_nm,parent_id) VALUES ("Printer",3);

INSERT into categories (category_nm,parent_id) VALUES ("Keyboard",24);
INSERT into categories (category_nm,parent_id) VALUES ("Mouse",24);
INSERT into categories (category_nm,parent_id) VALUES ("HeadPhones",24);

INSERT into categories (category_nm,parent_id) VALUES ("InkJet",25);
INSERT into categories (category_nm,parent_id) VALUES ("Laser",25);