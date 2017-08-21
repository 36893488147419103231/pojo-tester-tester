# pojo-tester-tester

This is a simple project that test the pojo-tester from http://pojo.pl

In testerterser.gettersandsetters

The test testGood MUST succeed, and all the tests bad*Test MUST FAIL.

Unfortunately, at the moment of writing this note some bugs in getters 
and setters remain undetected, and some tests for there are.

As of 16 Aug 2017, the following tests succeed whereas they should have failed:
bad2a
bad2c
bad3a
bad4b

In testerterser.equalshashcode

All tests must be fast.
Currently, smallTest succeeds, mediumTest takes a minute to succeed, and bigTest
just does not terminate. It looks like the time grows exponentially with increasing
number of fields, each next field makes the test 2x slower.


