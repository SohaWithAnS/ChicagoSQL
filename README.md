# ChicagoSQL (DavisBase) v 1.0

The purpose of this project is to build a simple database engine which operates entirely on the command line. This database is using a simplified file-per-table variation on the SQLite file format called DavisBase.
In our project, every table will be stored into separate files and each file will be next divided into pages. All pages are designed to store as nodes in a B-plus tree and a B-tree. The database engine is capable of supporting basic database requirements including DDL, DML and DQL commands. Our project is implemented using Java on Mac OS.

## Group Members
- Sheetal Nayak
- Soha Anant Parasnis
- Ratna Mani Meghana Pisati
- Prakruthi Srinivasa Reddy
- Zhangqi Wang

## Run
1. Download the .zip folder. Decompress the .zip. 
2. There will be 2 folders inside - docs and src. docs folder contains the Project Report. src folder contains the source code for the project. 
3. After opening the src folder, compile the DavisBase.java file using the following command - 
        ```javac DavisBase.java```
4. After compiling it, run it using the following command - 
        ```java DavisBase```
5. The database engine's prompt will launch. It will look something like this - 
        ```chicagosql>```
6. To see the various supported commands and their formats (which are very SQL-like), type the following - 
        ```help;```
7. For a detailed guide on how to run the supported commands, please refer to docs > TeamChicago_CS6360_GroupProjectReport.pdf.  
