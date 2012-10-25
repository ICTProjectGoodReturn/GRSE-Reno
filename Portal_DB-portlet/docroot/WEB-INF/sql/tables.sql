create table GoodReturn_Borrower (
	borrower_Id LONG not null primary key,
	abacus_Person_Id LONG,
	village VARCHAR(75) null,
	district VARCHAR(75) null,
	pdf_Link VARCHAR(75) null,
	currency_ DOUBLE,
	changed_By VARCHAR(75) null,
	changed_Time LONG,
	groupId LONG,
	companyId LONG
);

create table GoodReturn_BorrowerLoan (
	abacus_Borrower_Loan_Id LONG not null primary key,
	borrower_Id LONG,
	abacus_mfi_Id LONG,
	changed_By VARCHAR(75) null,
	changed_Time VARCHAR(75) null,
	groupId LONG,
	companyId LONG
);

create table GoodReturn_Gift_Certificate (
	certificate_Id LONG not null primary key,
	certificate_Amount DOUBLE,
	certificate_Type VARCHAR(75) null,
	changed_By VARCHAR(75) null,
	changed_Time LONG,
	groupId LONG,
	companyId LONG
);

create table GoodReturn_Lender (
	lender_Id LONG not null primary key,
	abacus_Person_Id LONG,
	certificate_Id LONG,
	employer_Name VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	heard_Of_Us VARCHAR(75) null,
	display_Name VARCHAR(75) null,
	date_Of_Birth DATE null,
	reason_For_Lending VARCHAR(75) null,
	about_Themselves VARCHAR(75) null,
	personal_Link VARCHAR(75) null,
	is_Public_Profile BOOLEAN,
	recieve_Emails BOOLEAN,
	recieve_GoodReturn_Info BOOLEAN,
	is_Anonymous BOOLEAN,
	is_Validated BOOLEAN,
	password_ VARCHAR(75) null,
	last_Login_Date DATE null,
	featured_Lender VARCHAR(75) null,
	is_Loan_Donation BOOLEAN,
	changed_By VARCHAR(75) null,
	changed_Time LONG,
	groupId LONG,
	companyId LONG
);

create table GoodReturn_Person (
	abacus_Person_Id LONG not null primary key,
	first_Name VARCHAR(75) null,
	last_Name VARCHAR(75) null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	address_Type VARCHAR(75) null,
	country VARCHAR(75) null,
	gender VARCHAR(75) null,
	salutation VARCHAR(75) null,
	status VARCHAR(75) null,
	phone_Number LONG,
	photo_URL VARCHAR(75) null,
	occupation VARCHAR(75) null,
	changed_By VARCHAR(75) null,
	changed_Time LONG,
	groupId LONG,
	companyId LONG
);

create table GoodReturn_Story (
	uuid_ VARCHAR(75) null,
	story_Id LONG not null primary key,
	abacus_Borrower_Loan_Id LONG,
	story_Type VARCHAR(75) null,
	story_Text VARCHAR(75) null,
	video_Url VARCHAR(75) null,
	is_Good_Enough_For_Marketing BOOLEAN,
	is_Good_Enough_For_Story BOOLEAN,
	status INTEGER,
	status_By_User_Id LONG,
	status_By_User_Name VARCHAR(75) null,
	status_Date DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG
);

create table GoodReturn_Supplementary_Table (
	table_Id LONG not null primary key
);

create table GoodReturn_Team (
	team_Id LONG not null primary key,
	team_Name VARCHAR(75) null,
	change_By VARCHAR(75) null,
	change_Time LONG,
	groupId LONG,
	companyId LONG
);

create table GoodReturn_TeamLender (
	team_lender_Id LONG not null primary key,
	lender_Id LONG,
	team_Id LONG,
	changed_By VARCHAR(75) null,
	changed_Time LONG,
	groupId LONG,
	companyId LONG
);

create table GoodReturn_TeamLenderLoan (
	account_Id LONG not null primary key
);

create table GoodReturn_TempBL (
	borrower_Name VARCHAR(75) not null,
	borrower_Loan_Id LONG not null,
	groupId LONG,
	companyId LONG,
	primary key (borrower_Name, borrower_Loan_Id)
);

create table GoodReturn_TempBl (
	borrower_Name VARCHAR(75) not null,
	borrower_Loan_Id LONG not null,
	groupId LONG,
	companyId LONG,
	primary key (borrower_Name, borrower_Loan_Id)
);