create index IX_BF45C8BE on GoodReturn_BorrowerLoan (borrower_Id);

create index IX_25A09D8A on GoodReturn_Story (abacus_Borrower_Loan_Id, story_Type);
create index IX_82C7D6C2 on GoodReturn_Story (borrower_Loan_Id, story_Type);
create index IX_B2A93327 on GoodReturn_Story (groupId, status);
create index IX_AA08C45E on GoodReturn_Story (group_Id, status);
create index IX_AD79647B on GoodReturn_Story (loan_Account_Id, story_Type);
create index IX_656CF1A8 on GoodReturn_Story (story_Id, status);
create index IX_71B7B40B on GoodReturn_Story (uuid_);
create unique index IX_51601CFF on GoodReturn_Story (uuid_, groupId);

create index IX_F6526234 on GoodReturn_TempBl (groupId);