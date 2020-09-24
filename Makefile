PACKAGE=$(shell basename $(CURDIR))

$(PACKAGE).jar: Helpers.class
	jar cf $@ -C .. $(PACKAGE)/$^

Helpers.class: Helpers.java
	javac $^
