SELECT FLOOR(PRICE / 10000) * 10000 AS "PRICE_GROUP", COUNT(PRICE)
FROM PRODUCT
GROUP BY FLOOR(PRICE / 10000) * 10000
ORDER BY PRICE_GROUP;

# TRUNC 함수를 썼더니 오류가 떠서 FLOOR 함수 사용