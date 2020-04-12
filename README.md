# COMP373_P3_BRIDGE

Project 3: Implementing Bridge Pattern

## Inspiration 

For this real-world example of the Bridge pattern, we used the implementation of assigning Major classes needed for a specific CS student's Majors. While this program only has a few examples and classes, you can see how it is extensible and could be expanded using the Bridge Pattern.

## How To Run the Code

To run the code, clone the repository to your own development envrionment and run Main (in Main folder).

## What Is The Problem Identified In This Project? 

Before implementing the Bridge pattern, the problem we faced was that due to the many students in the Computer Science department, we would have ended up with many duplicate classes. This would have been especially problematic since many Majors have similar coursework.

![](UML%20Diagram/Before.png)

## Solution

By implementing the Bridge pattern, it helped solved the problem by decoupling the CSStudent and Classes interface as seen below. This way, we will be able to have multiple students and majors, without having duplicate classes for each. It keeps the code DRY and extensible. 

![](UML%20Diagram/After.png)

## Applications Used 

* Draw.IO (ULM Model)
* Eclipse IDE For Java 

## Credit 

Anissa Cristerna,
Henry Espinoza, and
Irfan Poljak

