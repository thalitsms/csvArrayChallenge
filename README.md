# 🚀 SpringBoot WebMVC REST Challenge

## 📖 Overview:
This is a straightforward REST service built with SpringBoot WebMVC. It's designed to perform reverse operations on arrays and lists and to convert CSV data into arrays of strings.

## 🌟 Features:

1. 🔄 **Reverse an Array**:
    - Takes an array of objects and returns another array with the elements in reversed order without altering the original.

2. 🔄 **In-place Array Reversal**:
    - Takes an array of objects and returns the same array but with the elements in reversed order.

3. 🔄 **In-place List Reversal**:
    - Similar to in-place array reversal but works with a `java.util.List`.

4. 📄 **CSV to Array Conversion**:
    - Converts data from a CSV file into an array of strings.

## 🔧 Prerequisites:

- Java 11 or newer.
- Maven 3.6 or newer.

## 🚀 Getting Started:

1. Clone this repository.
   ```bash
   git clone https://github.com/thalitsms/csvArrayChallenge.git

2. Navigate to the project root directory in the terminal or command prompt.
   ```bash
   cd csvArrayChallenge
   
3. Execute the following command:
   ```bash
   mvn spring-boot:run
   
4. The service will start and will be available on port 8080.

🌐 Endpoints:
1. 🔄 Reverse Array:
URL: /api/reverse
Method: POST
Body: JSON Array
Returns: A new array with elements in reversed order.
2. 🔄 In-place Array Reversal:
URL: /api/reverse-inplace
Method: PUT
Body: JSON Array
Returns: The same array but with elements in reversed order.
3. 🔄 In-place List Reversal:
URL: /api/reverse-list
Method: PUT
Body: JSON Array
Returns: A list with elements in reversed order.
4. 📄 CSV to Array Conversion:
URL: /api/csv-to-array
Method: POST
Headers: Content-Type: text/plain
Body: Data in CSV format
Returns: A list of arrays with strings corresponding to field values.

🛠 Testing with Postman:
To test the endpoints, you can use tools like Postman:

1. Open Postman.
2. Configure the request based on the desired endpoint (URL, method, headers, and body).
3. Send the request and inspect the response.

    You can also create automated tests in Postman to validate the responses further.


🤝 Contributing:
Pull requests are welcome. For significant changes, please open an issue first to discuss what you would like to change.

