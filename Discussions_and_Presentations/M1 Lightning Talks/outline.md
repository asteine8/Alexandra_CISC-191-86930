- Types of Class Relationships:
  - "is-a" relationship: Coffee is a drink -> Coffee inherits properties from drinks
  - "has-a" relationships:
    - Association: A table has a coffee -> Tables can store the Coffees that it holds as a property
      - This can be bidirectional, since Coffees can store the Table they sit on as a property too
    - Aggregation: A table has legs -> The Leg class is defined within the Table class
      - Usually describes a relationship where a class is defined within another class
      - This type of relationship is typically implemented via class nesting
  - Disclaimer: *the definitions of types of "has-a" relationships is not universal and differed significantly in my research*
- Why use association?
  - Simplifies code: Much easier to say Book has an array of Pages rather than an array of page contents, page sources, etc...
  - Improves readability
- Why use aggregation?
  - "Helper classes" - only used within the encapsulating class (eg. )
    - Reduces the number of one-off classes to reduce the number of dependencies needed.
    - Link between classes is more obvious
  - Members of inner classes are available to the outer class

## Sources
Intro to use relationships with UML: http://www.cs.utsa.edu/~cs3443/uml/uml.html (See http://www.cs.utsa.edu/~cs3443/CS3443Syllabus.html for source)
Aggregation vs Association: https://people.cs.vt.edu/kafura/cs2704/aggregation.html 
Farrell J. (2019). Java Programming, Ninth Edition. Cengage. ISBN10: 1-337-39707-5

# Diagrams (Obsolete)
- UML diagrams
  - Inheritance: Textbook and Picture Book are both Books. A CS textbook is a textbook
  - Aggregation: Fan contains Blades and a Motor
  - Association: Grade-book has Grades and an Instructor

