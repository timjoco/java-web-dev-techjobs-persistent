## Part 1: Test it with SQL
id, name, employer_id, jobs_id

## Part 2: Test it with SQL
SELECT * FROM techjobs.employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE techjobs.job;

## Part 4: Test it with SQL
SELECT * FROM techjobs.job, techjobs.skill
WHERE techjobs.job.name = techjobs.skill.name & techjobs.skill.name IS NOT NULL
ORDER BY techjobs.skill.name asc;