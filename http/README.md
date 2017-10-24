### PersonService

##### How to run

Execute:

```bash
sbt ";project http; run"
```

And you will get:

```bash
PersonService has started at 0.0.0.0:8080
```

##### Get a person

`GET http://0.0.0.0:8080/person/[ID]`

Request example:

[http://0.0.0.0:8080/person/1](http://0.0.0.0:8080/person/1)

Response example:

```json
{
    "name": {
        "title": "mr",
        "first": "romain",
        "last": "hoogmoed"
    },
    "location": {
        "street": "1861 jan pieterszoon coenstraat",
        "city": "maasdriel",
        "state": "zeeland",
        "postCode": 69217
    },
    "email": "romain.hoogmoed@example.com",
    "id": "1",
    "picture": null,
    "gender": "male"
}
```

##### Link two people

`GET http://0.0.0.0:8080/person/link`

Request example:

```json
{
	"id1": "1",
	"id2": "2"
}
```

Response example:

```json
{
    "link": {
        "p1": {
            "name": {
                "title": "mr",
                "first": "romain",
                "last": "hoogmoed"
            },
            "location": {
                "street": "1861 jan pieterszoon coenstraat",
                "city": "maasdriel",
                "state": "zeeland",
                "postCode": 69217
            },
            "email": "romain.hoogmoed@example.com",
            "id": "1",
            "picture": null,
            "gender": "male"
        },
        "p2": {
            "name": {
                "title": "mademoiselle",
                "first": "morgane",
                "last": "lefebvre"
            },
            "location": {
                "street": "2260 rue de gerland",
                "city": "vucherens",
                "state": "graubünden",
                "postCode": 2877
            },
            "email": "morgane.lefebvre@example.com",
            "id": "2",
            "picture": {
                "large": "https://randomuser.me/api/portraits/women/62.jpg",
                "medium": "https://randomuser.me/api/portraits/med/women/62.jpg",
                "thumbnail": "https://randomuser.me/api/portraits/thumb/women/62.jpg"
            },
            "gender": "female"
        }
    }
}
```