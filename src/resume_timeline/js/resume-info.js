
$(function (){
    var job_info = [
        {
            title: "Software Developer",
            company: "AWE",
            location: "Chester, PA",
            summary: "Did the most awesome things you have ever heard",
        },
        {
            title: "Software Developer",
            company: "AWE",
            location: "Chester, PA",
            summary: "Did the most awesome things you have ever heard",
        }],
    makeJobToHtml = function(job) {
        return "<h4>" + job.title + " <span class=\"muted\">" + job.company + " - " + job.location + "</span></h4><p>" + job.summary + "</p>";
    };
    $("#xp").html($.map(job_info, makeJobToHtml).join(' ')); 
});