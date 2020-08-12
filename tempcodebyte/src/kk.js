/**
 * 
 */
var http = require('http');

http.createServer(function (req, res) {
  
fs.readFile("entry.html", function (err, pgres) { 
            
             
               
                res.writeHead(200, { 'Content-Type': 'text/html' }); 
                res.write(pgres); 
                res.end(); 
             
        
     

}}).listen(8080);