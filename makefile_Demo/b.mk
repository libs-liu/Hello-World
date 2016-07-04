object = peach.o main.o
all:$(objet)
$(object):%.o:%.c
	$(CC) -c $(CFLAGS) $< -o $@
