
-- 1.Find out the PG-13 rated comedy movies:
SELECT film_id,title, rating
FROM film
WHERE rating = 'PG-13' AND film_id IN (
    SELECT film_id
    FROM film_category
    WHERE category_id = (
        SELECT category_id
        FROM category
        WHERE name = 'Comedy'
    )
);

-- 2.Find out the top 3 rented horror movies:
SELECT film.title, COUNT(rental.rental_id) AS rental_count
FROM film
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
WHERE film.film_id IN (
    SELECT film_id
    FROM film_category
    WHERE category_id = (
        SELECT category_id
        FROM category
        WHERE name = 'Horror'
    )
)
GROUP BY film.film_id
ORDER BY rental_count DESC
LIMIT 3;

-- 3.Find out the list of customers from India who have rented sports movies:
SELECT customer.first_name, customer.last_name
FROM customer
JOIN address ON customer.address_id = address.address_id
JOIN city ON address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id
JOIN rental ON customer.customer_id = rental.customer_id
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
WHERE country.country = 'India' AND film.film_id IN (
    SELECT film_id
    FROM film_category
    WHERE category_id = (
        SELECT category_id
        FROM category
        WHERE name = 'Sports'
    )
);

-- 4.Find out the list of customers from Canada who have rented "NICK WAHLBERG" movies:
SELECT customer.first_name, customer.last_name
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
JOIN address ON customer.address_id = address.address_id
JOIN city ON address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id
WHERE country.country = 'Canada' AND actor.first_name = 'NICK' AND actor.last_name = 'WAHLBERG';


-- 5.Find out the number of movies in which "SEAN WILLIAMS" acted:
SELECT COUNT(*) AS movie_count
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.first_name = 'SEAN' AND actor.last_name = 'WILLIAMS';

