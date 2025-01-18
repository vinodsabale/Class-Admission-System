

create table signup
{
 id INT NOT NULL AUTO_INCREMENT,
   fname VARCHAR(255) NOT NULL,
	lname VARCHAR(255) NOT NULL,
	uname VARCHAR(255) NOT NULL,
	password VARCHAR(255) NOT NULL,
	mnumber VARCHAR(255) NOT NULL,

}

CREATE TABLE course (
   id INT NOT NULL AUTO_INCREMENT,
   cname VARCHAR(255) NOT NULL,
   cost VARCHAR(255) NOT NULL,
   PRIMARY KEY (Id)
);


create table fess_details
{
 rece_no NOT NULL AUTO_INCREMENT,
   student_name VARCHAR(255) NOT NULL,
	payment_mode VARCHAR(255) NOT NULL,
	check_no  NOT NULL,
	bank_name VARCHAR(255) NOT NULL,
	course_name VARCHAR(255) NOT NULL,
	gstin VARCHAR(255) NOT NULL,
	sgst VARCHAR(255) NOT NULL,
	total_in_words VARCHAR(255) NOT NULL,
	note VARCHAR(255) NOT NULL,
}