<%@attribute name="id" required="true" %>

<input id="${id}" required="true"/>
<script>
    $("#${id}").datepicker({dateFormat:'dd/mm/yy'});
</script>