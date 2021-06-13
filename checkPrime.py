def main():
    # Get user input and conver it into int datatype
    n = int(input("Please enter a number:"))

    # call is_prime(n) to check a number is prime or not
    if is_prime(n) == True:
        print("prime")
    else:
        print("not prime")


def is_prime(a):
    # Loop from 2 to a-1
    for i in (2, a):
        # check for prime
        # prime number is a number which 
        # is only divisible by 1 and himself
        # != 0 means not exactly divisible
        if a % i != 0:
            return True
        else:
            return False


main()
