# Rohit--CSGI

Important points for the sample project.

1)Open API's are used to create the documentation.
2)Swagger UI dependency has been set up and the APIs can be viewed from http://localhost:8080/swagger-ui.html
3)Testing has been performed by using the Open API UI testing utilities and also by Postman.
4)Sample file has been used from local machine to work upon.
    Content of this file is -
    
    My name is Rohit Tonk and I am 36 years old.
    My wife name is Pragya tonk and my son's name is Shaurya Tonk.

5)2 seperate functions are created for the below 2 tasks.

    Count Words Coding Assignment
        You are to create an indexing process for a search system your team is building.  It should process a file and apply the following business rules:
        - Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m"
        - Returns all the words longer than 5 characters


API specification looks like below
http://localhost:8080/v3/api-docs

{
    "openapi": "3.0.1",
    "info": {
        "title": "Words count in a sample file",
        "description": "This API exposes endpoints to read a file and provides the response .",
        "contact": {
            "name": "Rohit Tonk",
            "email": "Rohitto201124@gmail.com"
        },
        "version": "1.0"
    },
    "servers": [
        {
            "url": "http://localhost:8080",
            "description": "Development"
        }
    ],
    "tags": [
        {
            "name": "get",
            "description": "GET method for getting counts of words in the file whose length is greater than 5"
        },
        {
            "name": "get",
            "description": "This function is used to provide the count of words in the file with non-case sensitive alphabet"
        }
    ],
    "paths": {
        "/api/words": {
            "get": {
                "tags": [
                    "get"
                ],
                "summary": "get Count Of Total Words greater than Five",
                "description": "This function is used to provide the count of words in the file whose length is greater than 5",
                "operationId": "getCountOfTotalWordsGTFive",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "application/json": {
                                "schema": {
                                    "type": "integer",
                                    "format": "int32"
                                }
                            }
                        }
                    },
                    "404": {
                        "description": "File not found"
                    }
                }
            }
        },
        "/api/words/{id}": {
            "get": {
                "tags": [
                    "get"
                ],
                "summary": "get Count Of Words With Starts With Specific Alphapet",
                "description": "This function is used to provide the count of words in the file with non-case sensitive alphabet",
                "operationId": "getCountOfWordsWithStartsWithSpecificAlphapet",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "description": "Getting words starting with a particular non-case sensitive alphabet",
                        "required": true,
                        "schema": {
                            "type": "string"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "application/json": {
                                "schema": {
                                    "type": "integer",
                                    "format": "int32"
                                }
                            }
                        }
                    },
                    "404": {
                        "description": "File not found"
                    }
                }
            }
        }
    },
    "components": {}
}