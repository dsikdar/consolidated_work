var http = require('http');
var mysql=require('mysql');
var fs = require('fs');
http.createServer(function (req, res) {
  fs.readFile('index.html', function(err, data) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    return res.end();
  });
}).listen(8081);

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
