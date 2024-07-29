import random

descriptions = [
    "yellow house", "green house", "fun neighborhood",
    "A lot of friends", "Slightly larger yellow house", "Slightly smaller green house", 
    "Slight more fun neighborhood", "A few friends", "blue house", "purple house",
    "Larger blue house", "smaller purple house", "A good friend nearby", "A bad friend nearby"
                ]

id = 21

with open("Properties(1).txt", "+a") as f:
    for block in range(2, 6):
        for lot in range(1, 21):
            print(id)
            f.write(f"P-{id},{lot},{block},{random.randint(2000000, 10000000)},{random.randint(150, 800)},{random.choice(descriptions)}\n")
            id += 1