/**
 * http://usejsdoc.org/
 */
function insertData(){
	console.log("hello");
var sql = "INSERT INTO phonebook VALUES ('arindam',9830)";
con.query(sql, function(err, result) {
	if (err)
		throw err;
	console.log("1 record inserted");
});}