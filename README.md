KeyLoggerFlatfile
-----------------

A Sample program for how to use serialization as persistent Database.

Open this in Eclipse and run. All the source are in src/ if you use other tools.

The program will keep reading the input for commands.

 1. 'quit' to exit the program.
 2. 'list' to list the key and the time in database.
 3. 'reset' to reset the database.

If you enter any other string, the string will be saved to the database along
with the time.

At the end of the program, the database will be saved to the file callec 'test.db'

If you run the program again, the program will load the database from test.db
and continue using the old data. Try list it and you will see.

Troubleshooting
---------------

Deleting test.db should solve all your problem.
Serialization is picky about versioning.


