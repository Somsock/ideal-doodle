# ideal-doodle //name suggested by github 
Application for indie creators to gauge the feasibility of a book printing run 
through taking variable inputs provided by users and calculating quantity creators must sell to earn back production costs, 
total revenue, potential profits, and etc.

Currently incorporated: breakeven quantity, potential profits, total revenue, and unit price (per book)

Wishlist (to be incorporated): 
- input validation that takes into account "cancel" and maybe be a little sassy when the user input negative numbers or zero for book quantity and costs
- web application and .exe 
- marginal cost and marginal benifit 
- taxes and other fees for users to understand how much money they will actually keep after taxes/fees
- bundle table for comparision between different book quantity bundles (also a back up system for if user wants to revisit previous bundles/tables for comparision) 
- price conversion (currently usd only)
- book weight and shipping costs (also conversion to kg) 

Book: the book to be printed in the print run, stores book specific variables such as price, author, # of pages, etc.

Bundle: the application ask for a quantity of books and cost to produce said quantity, a bundle refers to that specific quantity of books

BundleTable: a table displaying the information of different bundles for comparision purposes to determine which bundle is most feasible, if any 
