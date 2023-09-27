-- SCHEMA: tests

-- DROP SCHEMA IF EXISTS tests ;

CREATE SCHEMA IF NOT EXISTS tests
    AUTHORIZATION postgres;

-- CREATE TABLES ;

-- Table for testcases ;

	CREATE TABLE IF NOT EXISTS tests.testcases (
	id serial4 NOT NULL,
		testcasename VARCHAR(255) NOT NULL,
		preconditions VARCHAR(255),
		obsolete boolean DEFAULT FALSE,
		CONSTRAINT testcases_pk PRIMARY KEY (id),
		CONSTRAINT testcases_un UNIQUE (testcasename)
	);

-- Table for Test steps and expected results ;

	CREATE TABLE IF NOT EXISTS tests.teststeps (
	id serial4 NOT NULL,
		functionalstep VARCHAR(255),
		expectedresult VARCHAR(255),
		stepresult boolean,
		testcase_id serial4 NOT NULL,
		CONSTRAINT teststeps_pk PRIMARY KEY (id),
		CONSTRAINT teststeps_fk FOREIGN KEY (testcase_id) REFERENCES tests.testcases(id)
	);

-- Table for checklists	;

	CREATE TABLE IF NOT EXISTS tests.checklists (
		id serial4 NOT NULL,
		checklistname VARCHAR(255) NOT NULL,
		testcase_id serial4 NOT NULL,
		CONSTRAINT checklists_pk PRIMARY KEY (id),
		CONSTRAINT checklists_fk FOREIGN KEY (testcase_id) REFERENCES tests.testcases(id)
	);

-- Table for

	CREATE TABLE IF NOT EXISTS tests.checklistresults (
		id serial4 NOT NULL,
		checklist_id serial4 NOT NULL,
		testresults boolean,
		CONSTRAINT checklistresults_pk PRIMARY KEY (id),
		CONSTRAINT checklistresults_fk FOREIGN KEY (checklist_id) REFERENCES tests.checklists(id)
	);