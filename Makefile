ibio.jar: Helpers.class
	jar cf $@ -C .. ibio/$^

Helpers.class: Helpers.java
	javac $^
