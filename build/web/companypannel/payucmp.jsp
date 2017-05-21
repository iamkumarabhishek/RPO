<%@ page import="java.util.*" %>
<%@ page import="java.security.*" %>

<%!
public boolean empty(String s)
	{
		if(s== null || s.trim().equals(""))
			return true;
		else
			return false;
	}
%>
<%!
	public String hashCal(String type,String str){
		byte[] hashseq=str.getBytes();
		StringBuffer hexString = new StringBuffer();
		try{
		MessageDigest algorithm = MessageDigest.getInstance(type);
		algorithm.reset();
		algorithm.update(hashseq);
		byte messageDigest[] = algorithm.digest();
            
		

		for (int i=0;i<messageDigest.length;i++) {
			String hex=Integer.toHexString(0xFF & messageDigest[i]);
			if(hex.length()==1) hexString.append("0");
			hexString.append(hex);
		}
			
		}catch(NoSuchAlgorithmException nsae){ }
		
		return hexString.toString();


	}
%>
<%	
	String merchant_key="rjQUPktU";
	String salt="e5iIg1jwi8";
	String action1 ="";
	String base_url="https://test.payu.in";
	int error=0; 
        String udf2="";
	String hashString="";
	
 

	
	Enumeration paramNames = request.getParameterNames();
	Map<String,String> params= new HashMap<String,String>();
    	while(paramNames.hasMoreElements()) 
	{
      		String paramName = (String)paramNames.nextElement();
      
      		String paramValue = request.getParameter(paramName);

		params.put(paramName,paramValue);
	}
	String txnid ="";
	if(empty(params.get("txnid"))){
		Random rand = new Random();
		String rndm = Integer.toString(rand.nextInt())+(System.currentTimeMillis() / 1000L);
		txnid=hashCal("SHA-256",rndm).substring(0,20);
	}
	else
		txnid=params.get("txnid");
        udf2 = txnid;
	String txn="abcd";
	String hash="";
	String hashSequence = "key|txnid|amount|productinfo|firstname|email|udf1|udf2|udf3|udf4|udf5|udf6|udf7|udf8|udf9|udf10";
	if(empty(params.get("hash")) && params.size()>0)
	{
		if( empty(params.get("key"))
			|| empty(params.get("txnid"))
			|| empty(params.get("amount"))
			|| empty(params.get("firstname"))
			|| empty(params.get("email"))
			|| empty(params.get("phone"))
			|| empty(params.get("productinfo"))
			|| empty(params.get("surl"))
			|| empty(params.get("furl"))
			|| empty(params.get("service_provider"))
	)
			
			error=1;
		else{
			String[] hashVarSeq=hashSequence.split("\\|");
			
			for(String part : hashVarSeq)
			{
				hashString= (empty(params.get(part)))?hashString.concat(""):hashString.concat(params.get(part));
				hashString=hashString.concat("|");
			}
			hashString=hashString.concat(salt);
			

			 hash=hashCal("SHA-512",hashString);
			action1=base_url.concat("/_payment");
		}
	}
	else if(!empty(params.get("hash")))
	{
		hash=params.get("hash");
		action1=base_url.concat("/_payment");
	}
%>
<html>

<script>
var hash='<%= hash %>';
function submitPayuForm() {
	
	if (hash == '')
		return;

      var payuForm = document.forms.payuForm;
      payuForm.submit();
    }
</script>

<body onload="submitPayuForm();">
<%
String am=request.getParameter("am");
String cm=request.getParameter("cm");
String pn=request.getParameter("pn");
String em=request.getParameter("em");
String cn=request.getParameter("cn");
String ad=request.getParameter("ad");

%>

<form action="<%= action1 %>" method="post" name="payuForm">
    
    <div style="display: none;">
<input type="text" name="key" value="<%= merchant_key %>" />
      <input type="text" name="hash" value="<%= hash %>"/>
      <input type="text" name="txnid" value="<%= txnid %>"/>
      <input type="text" name="udf2" value="<%= txnid %>" />
	  <input type="text" name="service_provider" value="payu_paisa" />
       
          <input name="surl" value="http://localhost:8080/project/success.jsp?tid=<%= txnid %>" size="64" />
          <input name="furl" value="http://localhost:8080/project/failed.jsp" size="64" />
          
       </div>
      <table>
        <tr>
          <td><b>Mandatory Parameters</b></td>
        </tr>
        <tr>
          <td>Amount: </td>
          <td><input name="amount" value="<%=am%>"/></td>
        </tr>
        <tr>
          <td>Company Name: </td>
          <td><input name="firstname" id="firstname" value="<%=cm%>" /></td>
        </tr>
        <tr>
          <td>PAN Number: </td>
          <td><input name="pn" value="<%=pn%>" /></td>
        </tr>
        <tr>
          <td>Email: </td>
          <td><input name="email" id="email" value="<%=em%>" /></td>
          <td>Phone: </td>
          <td><input name="phone" value="<%=cn%>" /></td>
        </tr>
        <tr>
          <td>Product Info: </td>
          <td colspan="3"><input name="productinfo" value="<%= (empty(params.get("productinfo"))) ? "" : params.get("productinfo") %>" size="64" /></td>
        </tr>
       
        
        <tr>
          <% if(empty(hash)){ %>
            <td colspan="4"><input type="submit" value="Submit" /></td>
          <% } %>
        </tr>
      </table>
    </form>


</body>
</html>