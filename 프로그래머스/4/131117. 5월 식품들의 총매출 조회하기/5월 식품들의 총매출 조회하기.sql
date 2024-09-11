SELECT A.PRODUCT_ID, A.PRODUCT_NAME, SUM(A.PRICE*B.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT A JOIN FOOD_ORDER B
ON A.PRODUCT_ID = B.PRODUCT_ID
WHERE TO_CHAR(B.PRODUCE_DATE, 'YYYY') = '2022' AND TO_CHAR(B.PRODUCE_DATE, 'MM') = '05'
GROUP BY A.PRODUCT_ID, A.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, A.PRODUCT_ID;