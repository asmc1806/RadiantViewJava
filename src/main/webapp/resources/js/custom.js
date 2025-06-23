$(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
    $('#sidebar').toggleClass('active');
    $('body').toggleClass('sidebar-collapsed');
});



$('#t-all').DataTable({
    dom: 'Bfrtip',
    language: {
        url: "https://cdn.datatables.net/plug-ins/1.11.3/i18n/es_es.json"
    },
    pageLength: 20,
    buttons: [
        {
            extend: 'copy',
            text: '<i class="fa fa-copy"></i> Copiar',
            class: 'dt-button main_bt'
        },
        {
            extend: 'csv',
            text: '<i class="fa fa-file-csv"></i> CSV',
            className: 'dt-button main_bt'
        },
        {
            extend: 'excel',
            text: '<i class="fa fa-file-excel-o"></i> Excel',
            className: 'dt-button main_bt'
        },
        {
            extend: 'pdf',
            text: '<i class="fa fa-file-pdf-o"></i> PDF',
            className: 'dt-button main_bt'
        },
        {
            extend: 'print',
            text: '<i class="fa fa-print"></i> Imprimir',
            className: 'dt-button main_bt'
        }
    ]
});
    
    
    
    
});


