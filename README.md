# Cucumber_taggedhook
This demo to demonstrate how to use tag and hook in cucumber
## Automated environment 
please refer to https://www.tutorialspoint.com/cucumber/cucumber_environment.htm
## What is cucumber tag
 automation tester can use tags to manage execution that there are more number of scenarios, some of them for smoke test, 
 some of them for regression test,in this situation, this is best way to use tag in Cucumber.
## How to mark a tag in feature file
As this below picture, we marked three scenarios tag as @First,@Second,
 ![](https://github.com/AnnaQiao/Cucumber_taggedhook/blob/master/pictures/feature_tag.JPG)
## What is cucuber hook
- Cucumber hook allow us to better manage the code workflow and help us to reduce code redundancy.
- the highlighted portion in given statement actually does the job of setting up  the webdriver and ending
the webdriver session. SO, It is actually  not relevent to the essence of "Given statement", and it is more like a set up for test. also if we think with broader prespective, then in the case of  mutiple scenarios for future, this webdriver setup and cleanup will run with each given statement.logically it makes sense to have the setup and cleanup executed only once.
- so to bring optimization, hooks can be utilized, more often we use two types of hooks: "Before" and "after" hooks, define within Before and after hooks always run, even if the scenario gets pass or failed, as the name suggest, "Before" hook get excuted well before any other test scenarios,  and "After" hook get excuted after all  the scenarios.
- to understand this notion better,let take  an example of feature file and definition file.
## an automated example of tagged & hook 
- Step 1: create a maven project, add necessary dependency in pom.xml.
- Step 2: create a feature file as "taggedHooks"
- Step 3: create a stepdefinition as "taggedHooksStepDefinition", as the below picture:
![](https://github.com/AnnaQiao/Cucumber_taggedhook/blob/master/pictures/stepdefinition.JPG)
- Step4: run the three scenarios of this feature, result as below picture:
Feature: test tag hook
this will run before the every Scenario
---------------start of the first scenario-----------------
setup..........
the first step
the second step
the third step
this will run after the every Scenario
---------------end of the first scenario-----------------
teardown..........
this will run before the every Scenario
---------------start of the 2&3 scenario-----------------
setup..........
the first step
the second step
the third step
this will run after the every Scenario
---------------end of the 2&3 scenario-----------------
teardown..........
this will run before the every Scenario
---------------start of the 2&3 scenario-----------------
setup..........
 
the first step
the second step
the third step
this will run after the every Scenario
---------------end of the 2&3 scenario-----------------
teardown..........

  
3 Scenarios ([32m3 passed[0m)
9 Steps ([32m9 passed[0m)
0m38.689s

