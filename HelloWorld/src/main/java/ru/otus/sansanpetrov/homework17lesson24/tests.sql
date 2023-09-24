-- SCHEMA: tests

-- DROP SCHEMA IF EXISTS tests ;

CREATE SCHEMA IF NOT EXISTS tests
    AUTHORIZATION postgres;
	
-- CREATE TABLES ;	
	CREATE TABLE IF NOT EXISTS tests.testcase (
	id smallserial NOT NULL,
		testname VARCHAR(256) NOT NULL,
		preconditions VARCHAR(256),
		functionalstep VARCHAR(256),
		obsolete boolean DEFAULT FALSE,
		CONSTRAINT testcase_pk PRIMARY KEY (id)
	);
	
	CREATE TABLE IF NOT EXISTS tests.verificationstep (
	id smallserial NOT NULL,
		testcase_functionalstep VARCHAR(256),
		verificationstep1 boolean,
		verificationstep2 boolean,
		verificationstep3 boolean,
		verificationstep4 boolean,
		verificationstep5 boolean,
		CONSTRAINT verificationstep_pk PRIMARY KEY (id)
	);
	
	CREATE TABLE IF NOT EXISTS tests.checklist (
		id smallserial NOT NULL,
		listname VARCHAR(256) NOT NULL,
		testcase_id smallserial NOT NULL,
		CONSTRAINT checklist_pk PRIMARY KEY (id)
	);
	CREATE TABLE IF NOT EXISTS tests.results (
		id smallserial NOT NULL,
		checklist_id smallserial NOT NULL,
		testresults boolean,
		CONSTRAINT results_pk PRIMARY KEY (id)
	);