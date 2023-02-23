from collections import Counter

def count_letters(file):
    with open(file, 'r') as f:
        return Counter(f.read().lower())
