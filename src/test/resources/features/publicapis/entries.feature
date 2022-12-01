
Feature: Entries

Scenario: Validate Response and data Count
  When User "GET" API "https://api.publicapis.org/entries"
  Then The response status code should be 200
  And Data "count" greather than 0