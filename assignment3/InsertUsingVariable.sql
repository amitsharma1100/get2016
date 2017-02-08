USE LIS;

SET @myVarValue1="Sudershan Publications";
SET @myVarValue2="Dhanpat Rai Books";

INSERT INTO publishers (publisher_nm) VALUES (@myVarValue1);
INSERT INTO publishers (publisher_nm) VALUES (@myVarValue2);