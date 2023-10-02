SELECT * FROM tests.testcases, tests.teststeps
WHERE testcases.id = teststeps.testcase_id
ORDER BY testcase_id ASC;