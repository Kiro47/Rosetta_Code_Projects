.section .text

.globl main

main:
movl $4,%eax	#syscall number 4
movl $1,%ebx	#number 1 for stdout
movl $str,%ecx	#string pointer
movl $16,%edx	#number of bytes
int $0x80	#syscall interrupt
ret

.section .data
str: .ascii "Hello world!\12"
