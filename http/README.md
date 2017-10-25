[TOC]

### PersonService

#### How to run

Execute:

```bash
sbt "http/runMain metrifier.http.server.HttpServer"
```

And you will get:

```bash
PersonService has started at 0.0.0.0:8080
```

#### Get the list of people

`GET http://0.0.0.0:8080/person`


#### Get a person

`GET http://0.0.0.0:8080/person/[ID]`

#### Get the linked people for a given person

`GET http://0.0.0.0:8080/person/[ID]/links`

#### Create a person

`POST http://0.0.0.0:8080/person`

Request example:

```javascript
{
    "name": {
        "title": "mr",
        "first": "rafa",
        "last": "paradea"
    },
    "location": {
        "street": "percebes 40",
        "city": "coto la campa",
        "state": "cadiz",
        "postCode": 11130
    },
    "email": "rafa.paradela@example.com",
    "id": "54",
    "picture": null,
    "gender": "male"
}
```
