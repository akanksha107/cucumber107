$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/radical/basic/cucumberFeatures/parametrized.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login2",
  "description": "As a fb user, I want to login using my username \u0026 password",
  "id": "facebook-login2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7875648068,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "validate sign up for any user",
  "description": "",
  "id": "facebook-login2;validate-sign-up-for-any-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "validate sign up",
  "rows": [
    {
      "cells": [
        "First Name",
        "Akanksha"
      ],
      "line": 6
    },
    {
      "cells": [
        "Last Name",
        "Choudhary"
      ],
      "line": 7
    },
    {
      "cells": [
        "Mobile No",
        "8698814222"
      ],
      "line": 8
    },
    {
      "cells": [
        "password",
        "akanksha@0428"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user selects radio button",
  "keyword": "When "
});
formatter.match({
  "location": "parametrizedTest.signup(DataTable)"
});
formatter.result({
  "duration": 32852381639,
  "status": "passed"
});
formatter.match({
  "location": "parametrizedTest.selectGender()"
});
formatter.result({
  "duration": 130984439,
  "status": "passed"
});
});