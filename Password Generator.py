import random

print("Welcome to Password Generator\n")

chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*().,?0123456789"

number = input("How many password do you want to generate? \n")
number = int(number)

length = input("What will be the length: \n")
length = int(length)

print("Here are you passwords: \n")

for password in range(number):
    password = ""
    for c in range(length):
        password += random.choice(chars)
    print(password)
