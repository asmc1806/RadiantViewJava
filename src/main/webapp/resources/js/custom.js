$(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
        $('body').toggleClass('sidebar-collapsed');
    });

    const LOGO_BASE64 = 'data:image/png;base64,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';

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
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'csv',
                text: '<i class="fa fa-file-csv"></i> CSV',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'excel',
                text: '<i class="fa fa-file-excel-o"></i> Excel',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'pdfHtml5',
                text: '<i class="fa fa-file-pdf-o"></i> PDF',
                className: 'dt-button main_bt',
                filename: 'Listado_de_usuarios',
                title: 'Listado de usuarios',
                orientation: 'landscape',
                exportOptions: {columns: ':not(.no-export)'},
                customize: function (doc) {
                    doc.content.unshift({
                        columns: [
                            {
                                image: LOGO_BASE64,
                                width: 200,
                                margin: [0, 0, 10, 0]
                            }
                        ],
                        columnGap: 10,
                        margin: [0, 0, 0, 12]
                    });
                    doc.content.splice(1, 0, {
                        text: 'Reporte de Usuarios Registrados',
                        alignment: 'center',
                        bold: true,
                        fontSize: 15,
                        margin: [0, 0, 0, 10],
                        color: '#2C3E50'
                    });
                    doc.content.splice(2, 0, {
                        text: 'Este documento contiene una lista completa de usuarios registrados en la plataforma.',
                        alignment: 'left',
                        fontSize: 11,
                        margin: [0, 0, 0, 16],
                        color: '#555555'
                    });
                    const tbl = doc.content.find(n => n.table);
                    if (tbl) {
                        tbl.layout = {
                            fillColor: i => (i === 0 ? '#000' : null)
                        };
                        tbl.table.headerRows = 1;
                        tbl.table.body[0].forEach(c => Object.assign(c, {
                                color: '#fff', bold: true, fontSize: 10
                            }));
                        tbl.table.widths = Array(tbl.table.body[0].length).fill('auto');
                    }
                    doc.footer = (p, pc) => ({
                            text: `Página ${p} de ${pc}   |   ${new Date().toLocaleDateString()}`,
                            alignment: 'right',
                            fontSize: 9,
                            margin: [20, 10, 20, 0],
                            color: '#666'
                        });
                }
            },
            {
                extend: 'print',
                text: '<i class="fa fa-print"></i> Imprimir',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            }
        ]
    });


    $('#Tbl_Insumos').DataTable({
        dom: 'Bfrtip',
        language: {
            url: "https://cdn.datatables.net/plug-ins/1.11.3/i18n/es_es.json"
        },
        pageLength: 20,
        buttons: [
            {
                extend: 'copy',
                text: '<i class="fa fa-copy"></i> Copiar',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'csv',
                text: '<i class="fa fa-file-csv"></i> CSV',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'excel',
                text: '<i class="fa fa-file-excel-o"></i> Excel',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'pdfHtml5',
                text: '<i class="fa fa-file-pdf-o"></i> PDF',
                className: 'dt-button main_bt',
                filename: 'Listado_de_insumos',
                title: 'Listado de insumos',
                orientation: 'landscape',
                exportOptions: {columns: ':not(.no-export)'},
                customize: function (doc) {
                    doc.content.unshift({
                        columns: [
                            {
                                image: LOGO_BASE64,
                                width: 200,
                                margin: [0, 0, 10, 0]
                            }
                        ],
                        columnGap: 10,
                        margin: [0, 0, 0, 12]
                    });
                    doc.content.splice(1, 0, {
                        text: 'Reporte de Insumos Registrados',
                        alignment: 'center',
                        bold: true,
                        fontSize: 15,
                        margin: [0, 0, 0, 10],
                        color: '#2C3E50'
                    });
                    doc.content.splice(2, 0, {
                        text: 'Este documento contiene una lista completa de insumos registrados en la plataforma.',
                        alignment: 'left',
                        fontSize: 11,
                        margin: [0, 0, 0, 16],
                        color: '#555555'
                    });
                    const tbl = doc.content.find(n => n.table);
                    if (tbl) {
                        tbl.layout = {
                            fillColor: i => (i === 0 ? '#000' : null)
                        };
                        tbl.table.headerRows = 1;
                        tbl.table.body[0].forEach(c => Object.assign(c, {
                                color: '#fff', bold: true, fontSize: 10
                            }));
                        tbl.table.widths = Array(tbl.table.body[0].length).fill('auto');
                    }
                    doc.footer = (p, pc) => ({
                            text: `Página ${p} de ${pc}   |   ${new Date().toLocaleDateString()}`,
                            alignment: 'right',
                            fontSize: 9,
                            margin: [20, 10, 20, 0],
                            color: '#666'
                        });
                }
            },
            {
                extend: 'print',
                text: '<i class="fa fa-print"></i> Imprimir',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            }
        ]
    });



    $('#Tbl_Examenes').DataTable({
        dom: 'Bfrtip',
        language: {
            url: "https://cdn.datatables.net/plug-ins/1.11.3/i18n/es_es.json"
        },
        pageLength: 20,
        columnDefs: [
            {
                targets: 1,
                width: "250px", 
                className: "text-truncate"
            }
        ],
        buttons: [
            {
                extend: 'copy',
                text: '<i class="fa fa-copy"></i> Copiar',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'csv',
                text: '<i class="fa fa-file-csv"></i> CSV',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            },
            {
                extend: 'excel',
                text: '<i class="fa fa-file-excel-o"></i> Excel',
                className: 'dt-button main_bt',
                exportOptions: {columns: ':not(.no-export)'}
            }
        ]
    });

});


