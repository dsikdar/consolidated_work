/**
 * http://usejsdoc.org/
 */
var mysql=require('mysql');
	var con = mysql.createConnection({
		host : "localhost",
		user : "root",
		password : "root",
		database : "phonebook"
	});

	con.connect(function(err) {
		if (err)
			throw err;
		console.log("Connected!");
	});