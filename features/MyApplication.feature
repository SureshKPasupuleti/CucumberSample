Feature:  Test FaceBook Smoke Scenario

  Scenario: Test login with valid credentials
      Given Open firefox and start application
      When I enter valid "sureshpasupuleti@gmail.com" and valid "selenium@123"
      Then user should be able to login successfully
