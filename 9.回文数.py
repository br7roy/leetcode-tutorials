def isPalindrome( x):
    if x < 0:
        return False

    ranger = 1
    while x / ranger >= 10:
        ranger *= 10

    while x:
        left = x / ranger
        right = x % 10
        if int(left) != int(right):
            return False

        x = (x % ranger) / 10
        ranger /= 100

    return True


if __name__ == '__main__':
    print(isPalindrome(121))
