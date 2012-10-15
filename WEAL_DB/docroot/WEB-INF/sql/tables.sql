create table WEAL_Borrower (
	abacus_Borrower_Id LONG not null primary key,
	write_Off_Date DATE null,
	phone LONG,
	wait_Time LONG,
	country VARCHAR(75) null,
	amount_Needed DOUBLE,
	amount_Needed_AUD DOUBLE,
	type_Of_Person VARCHAR(75) null,
	village VARCHAR(75) null,
	district VARCHAR(75) null,
	pdf_Link VARCHAR(75) null,
	currency_ DOUBLE,
	date_Applied DATE null
);

create table WEAL_Gift_Certificate (
	certificate_Id LONG not null primary key,
	certificate_Amount DOUBLE,
	certificate_Type VARCHAR(75) null
);

create table WEAL_Lender (
	lender_Id LONG not null primary key,
	salutation VARCHAR(75) null,
	employer_Name VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	heard_Of_Us VARCHAR(75) null,
	region VARCHAR(75) null,
	display_Name VARCHAR(75) null,
	date_Of_Birth DATE null,
	reason_For_Lending VARCHAR(75) null,
	about_Themselves VARCHAR(75) null,
	automatic_Re_lend BOOLEAN,
	monthly_Repayments DOUBLE,
	is_Public_Profile BOOLEAN,
	bank_Details VARCHAR(75) null,
	recieve_Emails BOOLEAN,
	recieve_GoodReturn_Info BOOLEAN,
	is_Anonymous BOOLEAN,
	is_Validated BOOLEAN,
	current_Balance DOUBLE,
	paypal_Email VARCHAR(75) null,
	password_ VARCHAR(75) null,
	last_Login_Date DATE null,
	featured_Lender VARCHAR(75) null,
	voucher_Id LONG,
	is_Loan_Donation BOOLEAN
);

create table WEAL_Loan (
	loan_Id LONG not null primary key,
	is_Partially_Funded BOOLEAN,
	amount_Requested DOUBLE,
	amount_Fulfilled DOUBLE,
	expiry_Date DATE null,
	date_Requisitioned DATE null,
	date_Of_Fulfillment DATE null,
	start_Date DATE null,
	end_Date DATE null,
	company_Id LONG,
	group_Id LONG,
	amount_Monthly INTEGER,
	account_Information VARCHAR(75) null,
	day_Of_Withdrawal INTEGER,
	final_Payment_Date DATE null,
	loan_Reason VARCHAR(75) null,
	loan_Type VARCHAR(75) null,
	loan_Time VARCHAR(75) null,
	funding_Preferences VARCHAR(75) null,
	maturity VARCHAR(75) null,
	repayments DOUBLE,
	status VARCHAR(75) null,
	payment_Type VARCHAR(75) null,
	payment_Receipt VARCHAR(75) null
);

create table WEAL_Person (
	abacus_Person_Id LONG not null primary key,
	first_Name VARCHAR(75) null,
	last_Name VARCHAR(75) null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	address_Type VARCHAR(75) null,
	country VARCHAR(75) null,
	gender VARCHAR(75) null,
	status VARCHAR(75) null,
	photo_URL VARCHAR(75) null,
	occupation VARCHAR(75) null
);

create table WEAL_Story (
	story_Id LONG not null primary key,
	final_Story VARCHAR(75) null,
	is_Good_Enough_For_Marketing BOOLEAN,
	is_Good_Enough_For_Final_Story BOOLEAN
);

create table WEAL_Supplementary_Table (
	table_Id LONG not null primary key
);

create table WEAL_Team (
	team_Id LONG not null primary key,
	team_Name VARCHAR(75) null,
	amount_Lent VARCHAR(75) null
);

create table WEAL_TeamLender (
	teamlender_Id LONG not null primary key
);

create table WEAL_TeamLenderLoan (
	account_Id LONG not null primary key
);