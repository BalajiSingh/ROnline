Feature: Test a web page for accessibility
    As a QA Tester
    I want to open the url https://www.levelaccess.com/
    So that I can test its different states with automatic tests in the Pro version of Access Engine
   
    Scenario: Run all automated accessibility tests on the specified web page in the page load state
        Given the web page "https://www.levelaccess.com/" is displayed.
        And Access Engine is set-up.
        When I call Access Engine's "runAllTests_returnInstances_JSON" api function.
        Then no accessibility issues are found.

    Scenario: Run all of the automatic accessibility tests on a specific node in the specified web page in the page load state
        Given the web page "https://www.levelaccess.com/" is displayed.
        And Access Engine is set-up.
        When I call Access Engine's "runAllTests_returnInstances_JSON_NodeCapture" api function on the node specified by the CSS selector "#wrapper".
        Then no accessibility issues are found.