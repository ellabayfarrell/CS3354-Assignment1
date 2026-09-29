# Grocery Management System

**CS3354 – Assignment 1: Java Program and Collaboration**
Texas State University

A command-line grocery management system written in Java. It uses **parallel arrays** to store each item's name, price, and stock, where the same index in each array refers to the same item. The user can view the inventory, restock an item, or exit through a text menu.

---

## Team Members & Contributions

| Member | Branch | Task | Method(s) |
|---|---|---|---|
| **Dang Nguyen** | `feature-menu` | Task 3 – User Menu | `main(String[] args)` |
| **Ella Farrell** | `feature-display` | Task 1 – Inventory Display | `printInventory(String[], double[], int[])` |
| **Hunter Norris** | `feature-restock` | Task 2 – Restock & Search | `restockItem(String[], int[], String, int)` |
| **Kalie Newman** | `cleanup` | Task 4 – Cleanup & Validation | `readInt(Scanner, String)` |

### Dang Nguyen – User Menu (`feature-menu`)
- Built the menu in `main` with a `Scanner` and a loop.
- Connected the menu to the other methods: **1** = View, **2** = Restock, **3** = Exit.
- Handled invalid menu input and the leftover newline after `nextInt()`.

### Ella Farrell – Inventory Display (`feature-display`)
- Wrote `printInventory`, which loops through the parallel arrays.
- Uses an `if-else` inside the loop so that only non-empty slots (`names[i] != null`) are printed.

### Hunter Norris – Restock & Search (`feature-restock`)
- Wrote `restockItem`, which searches for an item by name with `.equals()`.
- Adds the amount to the matching index in the stock array.
- Prints "Item not found." if the item is not in the inventory.

### Kalie Newman – Cleanup & Validation (`cleanup`)
- Added `readInt`, which loops until the user enters a valid whole number, so a non-numeric menu choice or restock amount re-prompts instead of crashing with `InputMismatchException`.
- Wired `readInt` into the menu choice and the restock amount, switched the item name prompt to `nextLine().trim()`, and rejected restock amounts that are zero or negative.
- Updated `printInventory` to use an `if-else` that also counts and reports empty inventory slots, and switched its output to `printf` formatting.
- Added a confirmation message after a successful restock and fixed comment/output typos (`sucessfully`, `variabklke`, `refrence`, `parrallel`).
- Fixed the missing `@param args` in `main`'s Javadoc, corrected Javadoc indentation, and regenerated `docs/` with author tags.
- Added a `.gitignore` for `.DS_Store` and compiled `.class` files.

---

## Project Structure

```
.
├── GroceryManagement.java   # Source code
├── docs/                    # Generated Javadoc documentation
└── README.md
```

---

## How to Run

Requires Java (JDK 8 or later).

```bash
javac GroceryManagement.java
java GroceryManagement
```

### Sample Menu
```
--- Menu ---
1. View
2. Restock
3. Exit
Please enter your choice (1-3):
```

---

## Documentation

Javadoc is generated into the `docs/` folder with:

```bash
javadoc -d docs -author GroceryManagement.java
```

Open `docs/index.html` in a browser to view it.

---

## Git Workflow

1. Each member created their own feature branch from `main`.
2. Each member completed their task and committed on their branch.
3. Each branch was merged into `main`.

The commit history and branch merges in this repository show each member's individual contributions.
