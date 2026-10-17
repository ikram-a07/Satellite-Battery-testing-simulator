SUMMARY:

A java- based console simulator that evaluates battery readings and identifies potential anomalies using pre-defined operating thresholds.

PROJECT OVERVIEW:

The Satellite Battery tester simulates a basic battery health check for a satellite system.
It accepts voltage, current, temperature and charge readings, evaluates each value against predefined thresholds ( which were determined through research) and produces an individual status for each measurement alongside an overall test result.

The project explores how software can be used to identify abnormal readings and support basic system monitoring in an engineering context 

FEATURES:
- Accepts voltage, current, temperature and charge inputs from the user 
- Evaluates readings against predetermined thresholds
- Classifies each measurement as PASS, WARNING or FAIL
- Identifies failed readings and displays the respective anomaly messages
- Generates an overall test result based on the individual measurements 
- Displays the results in a formatted console report

TECHNOLOGIES USED:

Java - program logic and decision-making

KEY CONCEPTS:
- User input and data handling 
- Conditional logic and threshold-based clarification
- Boolean logic for determining the overall test result 
- Basic anomaly detection and error identification

DATA SOURCES AND ASSUMPTIONS:

For the predetermined thresholds for each measurement, it was important for me to use values that reflected real-world data.

This range was determined from an average operating voltage range cited in ‘Nasa’s - Energy Storage Technologies for Future Planetary Science Missions’ document. 
The document describes data for the SOP large cell Li-ion batteries used in NASA missions. I used this information to determine the ranges for voltage and temperature, whereas the current and charge thresholds are simplified project assumptions.

Reference:
https://science.nasa.gov/wp-content/uploads/2023/09/Energy_Storage_Tech_Report_FINAL.pdf 
( Page 26 - Table 3-4. SOP large cell Li-ion batteries used in NASA missions )

TESTING:

The simulator was tested using 11 test cases to check its behaviour across different combinations of readings and outcomes, including warning and failure conditions.
This helped verify that the overall result accurately reflects the individual measurement statuses.

WHAT I LEARNED:

Through this project, I was able to develop my java skills and learn how to apply conditional logic, work with boolean variables and collect user input. 
I also developed a greater understanding of how predefined thresholds can be used to identify unusual readings and how testing different input combinations helps reveal and fix logical errors.

I particularly enjoyed being able to research and apply real world data from large scale NASA projects, allowing me to combine my interest in space systems with my software skills !



