#obj := $(wildcard *.o)

exe:peach.o main.o
	@echo haha
	gcc -o exe peach.o main.o

	
peach.o:peach.c
	@echo peach after
	gcc -c peach.c
main.o:main.c
	@echo main after
	gcc -c main.c
.PHONY: clean
clean:cleanobj cleanexe
	@echo clean
cleanobj:
	@echo cleanobj
	rm *.o
cleanexe:
	@echo cleanexe
	rm exe
