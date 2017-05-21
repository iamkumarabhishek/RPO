function validateForm() {
                var plat = document.forms["cntForm"]["j_plat"].value;
                var loc = document.forms["cntForm"]["j_loc"].value;
                var vac = document.forms["cntForm"]["j_vac"].value;
                var webAdd = document.forms["cntForm"]["j_website"].value;
                var apply = document.forms["cntForm"]["j_apply"].value;
                var type = document.forms["cntForm"]["j_type"].value;
                var sal = document.forms["cntForm"]["j_sal"].value;
                var cnt = document.forms["cntForm"]["j_cnt"].value;
                
                   
                if (plat === "") {
                    alert("platform must be filled out");
                    return false;
                }
                if (loc === "") {
                    alert("location cannot be blank");
                    return false;
                }
                if (vac === "") {
                    alert("vacancy should not be blank");
                    return false;
                }
                if (adr === "") {
                    alert("address field cannot be blank");
                    return false;
                }
                if (webAdd === "") {
                    alert("website to be filled");
                    return false;
                }
                if (apply === "") {
                    alert("apply date should be filled");
                    return false;
                }
                if (type === "") {
                    alert("job type is required");
                    return false;
                }
                if (sal === "") {
                    alert("salary to be filled");
                    return false;
                }
                if (cnt === "") {
                    alert("contact no can't be blank");
                    return false;
                }
                
            }