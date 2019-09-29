This application uses technologies likes Java 8, Spring boot, REST, JPA	

Its allows you to create a deposit, download a list of deposits, calculate interest using two algorithms, and check the history.<br>
<br> You can calculate profit using two interest capitalization algorithms: <br>
<ol>
<li><b>"DAILY"</b>-the algorithm capitalizes interest on a daily basis </li>
<li><b>"TOTAL"</b>-the algorithm calculates interest at the end, taking into account capitalization every 1, 3, 6 and 12 months</li>
</ol>

<ul>
<li>To fetch a deposits list use GET method whit URL address:<br>
	<b>localhost:8080/investment/</b>
</li>
<br>
<li>To add a new deposit use PUT method with URL address<br>
	<b>localhost:8080/investment/add</b> <br>
	and JSON body like :<br>
	 {<br>
        "id": 1,<br>
        "investmentName": "firstInvestment",<br>
        "interest": 4,<br>
        "validFrom": "2003-01-02",<br>
        "validTo": "2004-01-31"<br>
    } <br>
	</li>
<li>
	To counting profit using one of two algorithm use POST method with URL address : <br>
	<b>localhost:8080/investment/{id}/calculation </b><br>
	and JSON body like :<br>
	{ <br>
        "amount":1000, <br>
        "algorithmType":"TOTAL"<br>
    }<br><br>
</li>
<li>The last function about history calculation is not ready yet </li>

</ul>
<br>
<font size="3">MySql database is currently used in the project</font>
