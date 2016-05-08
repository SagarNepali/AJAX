<h1>Add Student Information!</h1>
<div class="pull-right">
    <p>
    <a href="javascript:void(0)" class="btn btn-primary btn-sm"> <span class="glyphicon glyphicon-plus"> </a>
    </p>
</div>

<div class="container-fluid">
    <form role="form">
        <div class="form-group">
            <label >First Name</label>
            <input name="firstName" type="text" class="form-control" id="firstName" placeholder="First Name">
        </div>
        <div class="form-group">
            <label >Last Name</label>
            <input name="lastName" type="text" class="form-control" required="true" id="lastName" placeholder="Last Name">
        </div>
        <div class="form-group">
            <label >Address</label>
            <input name="address" type="text" class="form-control" required="true" id="address" placeholder="Address">
        </div>
        <div class="form-group">
            <label >Contact</label>
            <input name="contact" type="text" class="form-control" required="true" id="contact" placeholder="Contact">
        </div>
        <div class="form-group">
            <label >Status</label>
            <input type="checkbox" class="form-control" required="true" id="status" placeholder="status">
        </div>
       
        
        <a href="javascript:void(0)" class="btn btn-default btn-danger" id="back-btn">Back</a>
        <button type="submit" class="btn btn-default btn-success" id="save-btn">Save</button>
                

        
    </form>


</div>