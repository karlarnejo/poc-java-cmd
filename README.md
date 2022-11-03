# Features
- Login/logout
- Emulate CLI
- Get absolute paths using file chooser 

# Brief

This is a PoC for Accenture. Getting the absolute path using the controller /upload/run is not possible because the server side is not capable of getting the path for security reasons. Unless you are doing a monolithic architecture, then yes but in this case, it is not. We are using ReactJS for this PoC.

# Instructions

After startup, you can visit http://localhost:8080/h2-console to add whatever data you want it is not necessary since it is already prefilled with username and password for userr (the extra r is not a typo) table.

Use either of these 3 to login:
- test@gmail.com:password
- test2@gmail.com:password
- test3@gmail.com:password

## Note

This port is set to 8080 while the frontend is set to 3000.