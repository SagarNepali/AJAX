


<table class="table table-bordered table-hover table-striped">
    <tr>
        <th><input type="checkbox" id="check-all"/></th>
        <th>Id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Address</th>
        <th>Contact</th>
        <th>Status</th>
        <th>Action</th>
    </tr>


    <tr>
        <td><input type="checkbox" id="select-all"/></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td>
            <a href="" class="btn btn-success btn-sm"> <span class="glyphicon glyphicon-pencil"> </a>

            <a href="" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure to delete this entry?')" ><span class="glyphicon glyphicon-trash" > </a>

        </td>
    </tr>
</table>

<script>
    $(document).on("ready", function () {
        $("#check-all").on("click", function () {
            var $this = $(this);
            $(".select-all").prop("checked", $this.is(":checked"));

        });
    });
</script>
